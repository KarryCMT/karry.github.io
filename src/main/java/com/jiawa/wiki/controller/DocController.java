package com.jiawa.wiki.controller;

import com.jiawa.wiki.req.DocQueryReq;
import com.jiawa.wiki.req.DocSaveReq;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.resp.DocQueryResp;
import com.jiawa.wiki.resp.PageResp;
import com.jiawa.wiki.service.DocService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/doc")
public class DocController {

    @Resource
    private DocService docService;
    // 查询出来返回一个数组对象
    @GetMapping("/all/{ebookId}")
    public CommonResp add(@PathVariable Long ebookId){
        CommonResp<List<DocQueryResp>> resp = new CommonResp<>();
        List<DocQueryResp> list = docService.all(ebookId);
        resp.setContent(list);
        return resp;
    }
    // 查询出来返回一个数组对象
    @GetMapping("/list")
    public CommonResp list(@Valid DocQueryReq req){
        CommonResp<PageResp<DocQueryResp>> resp = new CommonResp<>();
        PageResp<DocQueryResp> list = docService.list(req);
        resp.setContent(list);
        return resp;
    }

    @PostMapping("/save")
    public CommonResp save(@RequestBody DocSaveReq req){
        CommonResp resp = new CommonResp<>();
        docService.save(req);
        return resp;
    }

    // 查询出来返回一个数组对象
    @GetMapping("/find/{id}")
    public CommonResp find(@Valid Long id){
        CommonResp<String> resp = new CommonResp<>();
        String content = docService.find(id);
        resp.setContent(content);
        return resp;
    }

//    @DeleteMapping("/delete/{idsStr}")
//    public CommonResp delete(@PathVariable String idsStr) {
//        CommonResp resp = new CommonResp<>();
//        List<String> list = Arrays.asList(idsStr.split(","));
//        docService.delete(list);
//        return resp;
//    }

}
