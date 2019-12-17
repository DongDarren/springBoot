<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户信息 freemarker</title>
</head>
<body>
    <table border="1">
        <#list allUser as user>
            <tr>
                <td>${user_index}</td>
                <td>${user.id}</td>
                <td>${user.userId}</td>
                <td>${user.name}</td>
                <td>${user.phone}</td>
                <td>${user.nickname?if_exists}</td>
                <td>${user.headimgurl?if_exists}</td>
                <td>${user.wxOpenid?if_exists}</td>
                <td>${user.regtime?if_exists}</td>
                <td>${user.status}</td>
            </tr>
        </#list>
    </table>
</body>
</html>