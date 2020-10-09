package club.banyuan.mall.mgt.ums_admin.controller;

import club.banyuan.mall.mgt.dto.AdminLogin;
import club.banyuan.mall.mgt.dto.Message;
import club.banyuan.mall.mgt.dto.TokenMsg;
import club.banyuan.mall.mgt.ums_admin.entity.UmsAdmin;
import club.banyuan.mall.mgt.ums_admin.service.UmsAdminService;
import io.micrometer.core.instrument.util.MeterEquivalence;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {

  @Autowired
  private UmsAdminService umsAdminService;

  @RequestMapping("/admin/login")
  @ResponseBody
  public Message adminLogin(@RequestBody AdminLogin adminLogin) {
    System.out.println(adminLogin.getUsername());
    System.out.println(adminLogin.getPassword());
    Message message = new Message();
    message.setCode(200);
    message.setMessage("操作成功");

    TokenMsg tokenMsg = new TokenMsg();
    tokenMsg.setToken(
        "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImNyZWF0ZWQiOjE2MDExNzU1MTQzMzIsImV4cCI6MTYwMTc4MDMxNH0.V7sicTWS8A2SGPlks9E8qkSebH55H7W0AKokXiBLeJ-ZGrfz4WpfgPmHYwpAZaqfe9vNG0TT8qd8KtKsxoBMkg");
    tokenMsg.setTokenHead("Bearer");
    message.setData(tokenMsg);
    return message;
  }

  @RequestMapping("/admin/info")
  @ResponseBody
  public String adminInfo() {
    return "{\"code\":200,\"message\":\"操作成功\",\"data\":{\"roles\":[\"TEST\"],\"icon\":\"http://minio.banyuan.club/dev/preset/timg.jpg\",\"menus\":[{\"id\":1,\"parentId\":0,\"createTime\":\"2020-02-02T06:50:36.000+0000\",\"title\":\"商品\",\"level\":0,\"sort\":0,\"name\":\"pms\",\"icon\":\"product\",\"hidden\":0},{\"id\":2,\"parentId\":1,\"createTime\":\"2020-02-02T06:51:50.000+0000\",\"title\":\"商品列表\",\"level\":1,\"sort\":0,\"name\":\"product\",\"icon\":\"product-list\",\"hidden\":0},{\"id\":3,\"parentId\":1,\"createTime\":\"2020-02-02T06:52:44.000+0000\",\"title\":\"添加商品\",\"level\":1,\"sort\":0,\"name\":\"addProduct\",\"icon\":\"product-add\",\"hidden\":0},{\"id\":4,\"parentId\":1,\"createTime\":\"2020-02-02T06:53:51.000+0000\",\"title\":\"商品分类\",\"level\":1,\"sort\":0,\"name\":\"productCate\",\"icon\":\"product-cate\",\"hidden\":0},{\"id\":5,\"parentId\":1,\"createTime\":\"2020-02-02T06:54:51.000+0000\",\"title\":\"商品类型\",\"level\":1,\"sort\":0,\"name\":\"productAttr\",\"icon\":\"product-attr\",\"hidden\":0},{\"id\":6,\"parentId\":1,\"createTime\":\"2020-02-02T06:56:29.000+0000\",\"title\":\"品牌管理\",\"level\":1,\"sort\":0,\"name\":\"brand\",\"icon\":\"product-brand\",\"hidden\":0},{\"id\":7,\"parentId\":0,\"createTime\":\"2020-02-02T08:54:07.000+0000\",\"title\":\"订单\",\"level\":0,\"sort\":0,\"name\":\"oms\",\"icon\":\"order\",\"hidden\":0},{\"id\":8,\"parentId\":7,\"createTime\":\"2020-02-02T08:55:18.000+0000\",\"title\":\"订单列表\",\"level\":1,\"sort\":0,\"name\":\"order\",\"icon\":\"product-list\",\"hidden\":0},{\"id\":9,\"parentId\":7,\"createTime\":\"2020-02-02T08:56:46.000+0000\",\"title\":\"订单设置\",\"level\":1,\"sort\":0,\"name\":\"orderSetting\",\"icon\":\"order-setting\",\"hidden\":0},{\"id\":10,\"parentId\":7,\"createTime\":\"2020-02-02T08:57:39.000+0000\",\"title\":\"退货申请处理\",\"level\":1,\"sort\":0,\"name\":\"returnApply\",\"icon\":\"order-return\",\"hidden\":0},{\"id\":11,\"parentId\":7,\"createTime\":\"2020-02-02T08:59:40.000+0000\",\"title\":\"退货原因设置\",\"level\":1,\"sort\":0,\"name\":\"returnReason\",\"icon\":\"order-return-reason\",\"hidden\":0},{\"id\":12,\"parentId\":0,\"createTime\":\"2020-02-04T08:18:00.000+0000\",\"title\":\"营销\",\"level\":0,\"sort\":0,\"name\":\"sms\",\"icon\":\"sms\",\"hidden\":0},{\"id\":13,\"parentId\":12,\"createTime\":\"2020-02-04T08:19:22.000+0000\",\"title\":\"秒杀活动列表\",\"level\":1,\"sort\":0,\"name\":\"flash\",\"icon\":\"sms-flash\",\"hidden\":0},{\"id\":14,\"parentId\":12,\"createTime\":\"2020-02-04T08:20:16.000+0000\",\"title\":\"优惠券列表\",\"level\":1,\"sort\":0,\"name\":\"coupon\",\"icon\":\"sms-coupon\",\"hidden\":0},{\"id\":16,\"parentId\":12,\"createTime\":\"2020-02-07T08:22:38.000+0000\",\"title\":\"品牌推荐\",\"level\":1,\"sort\":0,\"name\":\"homeBrand\",\"icon\":\"product-brand\",\"hidden\":0},{\"id\":17,\"parentId\":12,\"createTime\":\"2020-02-07T08:23:14.000+0000\",\"title\":\"新品推荐\",\"level\":1,\"sort\":0,\"name\":\"homeNew\",\"icon\":\"sms-new\",\"hidden\":0},{\"id\":18,\"parentId\":12,\"createTime\":\"2020-02-07T08:26:38.000+0000\",\"title\":\"人气推荐\",\"level\":1,\"sort\":0,\"name\":\"homeHot\",\"icon\":\"sms-hot\",\"hidden\":0},{\"id\":19,\"parentId\":12,\"createTime\":\"2020-02-07T08:28:16.000+0000\",\"title\":\"专题推荐\",\"level\":1,\"sort\":0,\"name\":\"homeSubject\",\"icon\":\"sms-subject\",\"hidden\":0},{\"id\":20,\"parentId\":12,\"createTime\":\"2020-02-07T08:28:42.000+0000\",\"title\":\"广告列表\",\"level\":1,\"sort\":0,\"name\":\"homeAdvertise\",\"icon\":\"sms-ad\",\"hidden\":0},{\"id\":21,\"parentId\":0,\"createTime\":\"2020-02-07T08:29:13.000+0000\",\"title\":\"权限\",\"level\":0,\"sort\":0,\"name\":\"ums\",\"icon\":\"ums\",\"hidden\":0},{\"id\":22,\"parentId\":21,\"createTime\":\"2020-02-07T08:29:51.000+0000\",\"title\":\"用户列表\",\"level\":1,\"sort\":0,\"name\":\"admin\",\"icon\":\"ums-admin\",\"hidden\":0},{\"id\":23,\"parentId\":21,\"createTime\":\"2020-02-07T08:30:13.000+0000\",\"title\":\"角色列表\",\"level\":1,\"sort\":0,\"name\":\"role\",\"icon\":\"ums-role\",\"hidden\":0},{\"id\":24,\"parentId\":21,\"createTime\":\"2020-02-07T08:30:53.000+0000\",\"title\":\"菜单列表\",\"level\":1,\"sort\":0,\"name\":\"menu\",\"icon\":\"ums-menu\",\"hidden\":0},{\"id\":25,\"parentId\":21,\"createTime\":\"2020-02-07T08:31:13.000+0000\",\"title\":\"资源列表\",\"level\":1,\"sort\":0,\"name\":\"resource\",\"icon\":\"ums-resource\",\"hidden\":0}],\"username\":\"admin\"}}";
  }

  @RequestMapping("/admin/updateStatus/{id}")
  @ResponseBody
  public void updateStatus(@RequestParam("status") Integer status, @PathVariable("id") Long id) {
    System.out.println("status:" + status);
    System.out.println("id:" + id);
    Message message = new Message();
    message.setCode(200);
    message.setData();
  }

  @RequestMapping("/admin/list")
  @ResponseBody
  public Message getList(String keyword, Integer pageNum, Integer pageSize) {
    Message message = new Message();
    List<UmsAdmin> adminList = umsAdminService.getUmsAdminListByPage(keyword, pageNum, pageSize);
    List<UmsAdmin> umsAdminList = umsAdminService.getUmsAdminList();
    Map<String, Object> map = new HashMap<>();
    map.put("list", adminList);
    map.put("pageNum", pageNum);
    map.put("pageSize", pageSize);
    map.put("total", umsAdminList.size());
    map.put("totalPage", (umsAdminList.size() / pageSize) + 1);
    message.setCode(200);
    message.setData(map);
    message.setMessage("操作成功");
    return message;
  }

  @RequestMapping("/admin/update/{id}")
  @ResponseBody
  public Message adminUpdate(@PathVariable("id") Long id) {
    umsAdminService.updateAdmin(id);
    Message message = new Message();
    message.setCode(200);
    message.setMessage("更新成功");
    return message;
  }

  @RequestMapping("/admin/delete/{id}")
  @ResponseBody
  public Message adminDelete(@RequestBody UmsAdmin umsAdmin, @PathVariable("id") Long id) {
    umsAdminService.deleteAdmin(id);
    Message message = new Message();
    message.setCode(200);
    message.setData(umsAdmin);
    message.setMessage("删除成功");
    return message;
  }

  @RequestMapping("/admin/register")
  @ResponseBody
  public Message adminRegister(@RequestBody UmsAdmin umsAdmin) {
    Message message = new Message();
//    List<UmsAdmin> umsAdminList
    Map<String, Object> map = new HashMap<>();
    map.put("id", umsAdmin.getId());
    map.put("username", umsAdmin.getUsername());
    map.put("password", umsAdmin.getPassword());
    map.put("nickName", umsAdmin.getNickName());
    map.put("note", umsAdmin.getNote());
    map.put("email", umsAdmin.getEmail());
    map.put("createTime", umsAdmin.getCreateTime());
    map.put("loginTime", umsAdmin.getLoginTime());
    map.put("icon", umsAdmin.getIcon());
    map.put("status", umsAdmin.getStatus());
    message.setCode(200);
    message.setData(map);
    message.setMessage("注册成功");
    return message;
  }

}
