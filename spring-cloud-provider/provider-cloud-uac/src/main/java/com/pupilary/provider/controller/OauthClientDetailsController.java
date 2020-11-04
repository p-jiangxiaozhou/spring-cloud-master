package com.pupilary.provider.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pupilary.base.wrapper.PageWrapMapper;
import com.pupilary.base.wrapper.PageWrapper;
import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import com.pupilary.core.base.BaseController;
import com.pupilary.provider.dto.OauthClientDetailsDto;
import com.pupilary.provider.query.OauthClientDetailsQuery;
import com.pupilary.provider.service.OauthClientDetailsService;
import com.pupilary.provider.vo.OauthClientDetailsVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author takesi
 * @date 2020-10-06
 */
@RestController
@AllArgsConstructor
@RequestMapping(value = "/clients")
public class OauthClientDetailsController extends BaseController {

    private final OauthClientDetailsService oauthClientDetailsService;

    @GetMapping(value = "/list")
    public PageWrapper<List<OauthClientDetailsVo>> list(OauthClientDetailsQuery oauthClientDetailsQuery) {
        IPage<OauthClientDetailsVo> result = oauthClientDetailsService.listClient(oauthClientDetailsQuery, true);
        return PageWrapMapper.wrap(
                result.getRecords(),
                result.getCurrent(),
                result.getSize(),
                result.getTotal()
        );
    }

    @GetMapping(value = "/{clientId}")
    public Wrapper<OauthClientDetailsVo> get(@PathVariable Long clientId) {
        OauthClientDetailsVo result = oauthClientDetailsService.loadById(clientId);
        return WrapMapper.ok(result);
    }

    @DeleteMapping(value = "/{clientId}")
    public Wrapper<String> delete(@PathVariable Long clientId) {
        oauthClientDetailsService.deleteById(clientId);
        return WrapMapper.ok("删除成功");
    }

    @PostMapping(value = "/add")
    public Wrapper<String> add(@RequestBody OauthClientDetailsDto oauthClientDetailsDto) {
        oauthClientDetailsService.saveClient(oauthClientDetailsDto);
        return WrapMapper.ok();
    }

    @PutMapping(value = "/save")
    public Wrapper<String> save(@RequestBody OauthClientDetailsDto oauthClientDetailsDto) {
        oauthClientDetailsService.saveClient(oauthClientDetailsDto);
        return WrapMapper.ok();
    }

}
