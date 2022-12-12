<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
<body>
<center>
    <#--<p>
        welcome ${name} to freemarker!
    </p>
    <p>性别：
        <#if sex==0>
            女
        <#elseif sex==1>
            男
        <#else>
            保密
        </#if>
    </p>-->
    <h4>我的好友：</h4>
    <#--<#list sysUser as item>-->
    账号：${sysUser.account}
    姓名：${sysUser.realName}
    密码：${sysUser.password}
    性别：
    <#if sysUser.sex==1>
    男
    <#elseif sysUser.sex==2>
    女
    </#if>
    <#--, 电话：${item.phone},地址：${item.address}
        <br>

    <#--</#list>-->
</center>
</body>
</html>