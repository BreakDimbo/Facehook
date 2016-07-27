package com.facehook.action;

import com.facehook.domain.AlbumEntity;
import com.facehook.domain.UsersEntity;
import com.facehook.service.AlbumMgr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Break.D on 7/27/16.
 */
@Controller
@RequestMapping(value = "/album")
public class AlbumController {

    private AlbumMgr albumMgr;

    public AlbumMgr getAlbumMgr() {
        return albumMgr;
    }

    @Resource
    public void setAlbumMgr(AlbumMgr albumMgr) {
        this.albumMgr = albumMgr;
    }

    @RequestMapping(value = "/gotoAlbum")
    public String gotoAlbum() {
        return "individual/myAlbum";
    }

    @RequestMapping(value = "/gotoAddAlbum", method = RequestMethod.GET)
    public String gotoAddAlbum(Model model) {
        model.addAttribute("albumInfo", new AlbumEntity());
        return "individual/addAlbum";
    }

    @RequestMapping(value = "/gotoAddPhoto")
    public String gotoAddPhoto() {
        return "individual/addPhoto";
    }

    @RequestMapping(value = "/gotoCurrentAlbum")
    public String gotoCurrentAlbum() {
        return "individual/currentAlbum";
    }

    @RequestMapping(value = "gotoCurrentPhoto")
    public String gotoCurrentPhoto() {
        return "individual/currentPhoto";
    }

    @PostMapping(value = "/addAlbum")
    public String addAlbum(@ModelAttribute("albumInfo") AlbumEntity albumEntity, HttpSession session) {

        albumEntity.setUserById((UsersEntity) session.getAttribute("loginUser"));
        int id = albumMgr.save(albumEntity);
        albumEntity.setId(id);
        session.setAttribute("album", albumEntity);
        return "redirect:/album/gotoAddPhoto";
    }

    @PostMapping(value = "/uploadPhoto")
    public String uploadPhoto(@RequestParam("file") MultipartFile file, @RequestParam("id") int id) {

        //upload the photo
        System.out.println(file.getOriginalFilename());
        System.out.println(id);

        return "redirect:/album/gotoCurrentAlbum";

    }
}
