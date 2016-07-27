package com.facehook.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.*;

/**
 * Created by Break.D on 7/27/16.
 */
public class MyTools {

    public static String myUpload(HttpSession session, MultipartFile file, int id) {
        String filePath = session.getServletContext().getRealPath("/");
        String filename = file.getOriginalFilename();
        InputStream in = null;
        OutputStream out = null;

        try {
            in = file.getInputStream();
            //保存到指定目录下
            filePath = filePath + "/images/" + id + "/head/";

            //判断目录是否存在,不存在则创建
            File dir = new File(filePath);
            if (!dir.isDirectory()) {
                dir.mkdirs();
            }

            //头像文件只允许上传一张,更改文件名为用户编号+后缀
            filename = id + filename.substring(filename.indexOf("."), filename.length());

            out = new FileOutputStream(filePath + filename);

            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = in.read(buffer, 0, 1024)) != -1) {
                out.write(buffer, 0, len);
            }

            out.flush();
            out.close();
            in.close();


        } catch (IOException e) {
            try {
                out.close();
                in.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        return filename;
    }
}
