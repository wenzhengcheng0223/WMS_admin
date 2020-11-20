package team.zmn.repository.pojo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ZhengCheng.Wen
 * Date: 2020/7/2
 * Time: 18:18
 */

public class Result {

    private Integer code = 0;
    private String msg;
    private Long count;
    private List data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
