package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.service.HomeService;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.vo.HomeIndexVO;
import tech.wetech.weshop.web.base.BaseController;

/**
 * @author cjbi
 */
@RestController
@RequestMapping("/wechat/home")
public class WechatHomeController extends BaseController {

    @Autowired
    private HomeService homeService;


    @GetMapping("/index")
    public Result<HomeIndexVO> index() {
        return Result.success(homeService.index());
    }

}