package team.zmn.repository.service;

import team.zmn.repository.pojo.Result;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/3
 * Time: 11:58
 */

public interface RepositoryMessageService {
    /**
     * 查询所有仓库内的所有商品
     * @return
     */
    Result selectAll();
}
