package com.limbo.util;

import java.io.*;

/**
 * Created by Break.D on 7/23/16.
 */
public class LoadDataToMySQL {


    /**
     * 用于将文本数据转换文sql 可执行数据
     *
     * @param name 文件名+表名
     */
    public void dataTransfer(String name, int num) {
        String path = "/Users/Break.D/Documents/data1/" + name;
        String tpath = System.getProperty("user.dir") + "/src/main/resources/sql/" + name;
        System.out.println(tpath);
        File src = new File(path + ".txt");
        File tar = new File(tpath + ".sql");
        FileInputStream in = null;
        FileOutputStream out = null;
        BufferedReader bf = null;
        BufferedWriter bw = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(tar);
            bf = new BufferedReader(new InputStreamReader(in));
            bw = new BufferedWriter(new OutputStreamWriter(out));

            String line = null;
            while ((line = bf.readLine()) != null) {
                String[] words = line.split("[ +,\t]");
//                line = new String(line.getBytes("latin1"), "UTF-8");
                String outStr = "";
                if (num == 3) {
                    outStr = "insert into " + name + " values( " + words[0] + ", " + "\"" + words[1] + "\", " + words[2] + ");";
                } else if (num == 4) {
                    outStr = "insert into " + name + " values( " + words[0] + ", " + "\"" + words[1] + "\", " + words[2] + "," + words[3] + ");";
                } else if (num == 2) {
                    outStr = "insert into " + name + " values( " + words[0] + ", " + "\"" + words[1] + "\"" + ");";
                }


                bw.write(outStr + "\n");
//                System.out.println(outStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                bf.close();
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        new LoadDataToMySQL().dataTransfer("localcity", 3);
    }
}
