
package com.wooshop.modules.unit.service;


import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.io.IOException;
import com.wooshop.modules.unit.service.dto.WooshopStoreProductUnitDto;
import org.springframework.data.domain.Pageable;
import com.wooshop.modules.service.BaseService;

import com.wooshop.domain.PageResult;
import com.wooshop.modules.unit.domain.WooshopStoreProductUnit;

import com.wooshop.modules.unit.service.dto.WooshopStoreProductUnitQueryCriteria;

/**
* @author woo
* @date 2021-11-24
* 注意：
* 本软件为www.wooshop.com开发研制，未经购买不得使用
* 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
* 一经发现盗用、分享等行为，将追究法律责任，后果自负
*/


public interface WooshopStoreProductUnitService  extends BaseService<WooshopStoreProductUnit>{

    /**
    * 查询数据分页
    * @param criteria 条件
    * @param pageable 分页参数
    * @return Map<String,Object>
    */
    PageResult<WooshopStoreProductUnitDto>  queryAll(WooshopStoreProductUnitQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria 条件参数
    * @return List<WooshopStoreProductUnitDto>
    */
    List<WooshopStoreProductUnit> queryAll(WooshopStoreProductUnitQueryCriteria criteria);

    /**
    * 导出数据
    * @param all 待导出的数据
    * @param response /
    * @throws IOException /
    */
    void download(List<WooshopStoreProductUnitDto> all, HttpServletResponse response) throws IOException;
}
