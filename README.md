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

* action: 主要是 SpringMVC 的各个 Controller，负责业务逻辑的控制
  - UserController：负责 home.jsp 和 homePage.jsp 的跳转
  - LoginController: 验证登录信息
    + getLoginInfo（）：创建 Model 装进 View 里，用来装表格提交的数据。检查cookie 是否已经设置自动登录。
    + checkLoginInfo（）：接收 View 传来的 Model 并核实用户信息（UserMgr.check()）,设置 session，根据是否自动登录设置 cookies。确认登录成功或失败。
    + logout（）：消灭 session，消灭 cookie。
  - RegisterController:控制注册相关行为
    + 因为在注册时允许用户选择大学，居住地，等等，所以需要 spring 提前各个 domain 的 service 注入。
    + createUserForm（）创建 Model，接收表单提交的数据。
    + gotoRegister（）将国家、部分省、部分大学放进 request 里，用作初始化时的显示。
    + userFormSubmit（）首先判断表单提交新是否有误。
* dao
* dto
* domain
* service
