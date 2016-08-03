# Facehook

## 模块分类

### 登录模块

LoginController(判断是否需自动登录，如是则直接转往个人主页，将用户信息设置进 session，否则创建 model 放进 index.jsp 供表单使用)
——> index.jsp ——> LoginController（检测表单提交的数据是否有效，另外判断是否需要自动登录，进行 cookie 的设置。）

### 注册模块

主要使用了 ajax 技术。选取大学和居住地: jsp->js->servlet

> readyState表示XMLHttpRequest对象的处理状态：  
0:XMLHttpRequest对象还没有完成初始化。  
1:XMLHttpRequest对象开始发送请求。  
2:XMLHttpRequest对象的请求发送完成。  
3:XMLHttpRequest对象开始读取服务器的响应。  
4:XMLHttpRequest对象读取服务器响应结束。  

使用了 hibernate-validate 技术进行表单的验证: 

jsp(<form:error path>) -> Controller(@Valid ModelAttribute) -> Dto(@NotEmpty)


### 主页展示模块

home.jsp/ homePage.jsp


### 更换头像模块

uploadPhoto.jsp  
UploadController: MultipartFile  
MyTools:  
MyTools.myUpload(session, photo, user.getId());

用来拿到 MultipartFile 并上传服务器（根据id 创建对应文件夹）


## 分层设计：

* action
  - 主要是 SpringMVC 的各个 Controller，负责业务逻辑的控制
  - 
* dao
* dto
* domain
* service
