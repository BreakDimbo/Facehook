package com.facehook.servlet;

import com.facehook.domain.ProvinceEntity;
import com.facehook.domain.UniversityEntity;
import com.facehook.service.ProvinceMgr;
import com.facehook.service.UniversityMgr;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public class ChangeInfo extends HttpServlet {

    private UniversityMgr universityMgr;
    private ProvinceMgr provinceMgr;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //拿到 bean
        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
        universityMgr = (UniversityMgr) ctx.getBean("universityMgrImpl");
        provinceMgr = (ProvinceMgr) ctx.getBean("provinceMgrImpl");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/xml;charset=utf-8");
        resp.setHeader("Cache-Control", "no-cache");
        PrintWriter out = resp.getWriter();

        //拿到参数
        String pidStr = req.getParameter("pid");
        String cidStr = req.getParameter("cid");
        String cuidStr = req.getParameter("cuid");

System.out.println(cuidStr);

        //如果是改变省的
        if (cuidStr != null && !cuidStr.trim().equals("")) {

            int cuid = Integer.parseInt(cuidStr);
            List<ProvinceEntity> plist = provinceMgr.showProByCountryId(cuid);
            List<UniversityEntity> ulist = universityMgr.showUniByProCouId(1, cuid);

            //省标签组
            String pres = "<allInfo>";

            for (ProvinceEntity p : plist) {
                pres += "<pro><id>" + p.getId() + "</id><countryId>" + p.getCountryId() + "</countryId><name>" + p.getName() + "</name></pro>";
            }


            //大学标签组

            for (UniversityEntity u : ulist) {
                pres += "<unit><id>" + u.getId() + "</id><name><![CDATA[" + u.getName() + "]]></name></unit>";
            }

            pres += "</allInfo>";

            out.write(pres);
            out.close();

//System.out.println(pres);

        }


        //如果是改变大学的
        if (pidStr != null && !pidStr.trim().equals("") && cidStr != null && !cidStr.trim().equals("")) {
            int pid = Integer.parseInt(pidStr);
            int cid = Integer.parseInt(cidStr);

            //取出数据
            List<UniversityEntity> list = universityMgr.showUniByProCouId(pid, cid);

            //拼字符串
            String result = "<allUniversities>";

            for (UniversityEntity u : list) {
                result += "<unit><id>" + u.getId() + "</id><name><![CDATA[" + u.getName() + "]]></name></unit>";
            }

            result += "</allUniversities>";
//System.out.println(result);

            out.write(result);
            out.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
