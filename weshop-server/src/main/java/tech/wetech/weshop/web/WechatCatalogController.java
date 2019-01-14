package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tech.wetech.weshop.service.CategoryService;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.vo.CategoryIndexVO;
import tech.wetech.weshop.vo.CategoryVO;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/wechat/catalog")
@Validated
public class WechatCatalogController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/index")
    public Result<CategoryIndexVO> index(Integer id) {
        return Result.success(categoryService.index(id == null ? 0 : id));
    }

    @GetMapping("/current")
    public Result<CategoryVO> current(@NotNull @RequestParam("id") Integer id) {
        return Result.success(categoryService.current(id));
    }

}