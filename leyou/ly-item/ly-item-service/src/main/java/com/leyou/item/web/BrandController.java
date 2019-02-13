package com.leyou.item.web;


import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {


    @Resource
    private BrandService brandService;

    @RequestMapping("/queryBrandByPage")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key) {
        PageResult<Brand> result = this.brandService.queryBrandByPageAndSort(page,rows,sortBy,desc, key);
            if (result==null||result.getItems().size() == 0){
                return new ResponseEntity<>(HttpStatus.OK);
            }
        return ResponseEntity.ok(result);
    }
    @PostMapping("/savaBrand")
    public ResponseEntity<Void> savaBrand(Brand brand, @RequestParam("cids") List<Long> cids){
         brandService.savaBrand(brand,cids);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}