<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title><@block name="title">father</@block></title>
    <link rel="stylesheet" href="css/common.css" />
    <link rel="stylesheet" href="css/index.css" />
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=7IN3zE1VQTY6XEGACnvqWRdLZjXeEvRs"></script>
</head>

<body>
<div class="outer ">
    <!--最外层div，窗口-->
    <div class="inner">
        <!--包裹全部需滚动切换页面的div，-->
        <!--滚动切换第一页-->
        <div class="index ">
            <!--导航条-->
            <div class="line"></div>
            <div class="index-header">
                <div class="auto">
                    <a href="index.html" id="logo"></a>
                    <ul class="clear">
                        <li>
                            <a href="index.html">首页</a>
                        </li>
                        <li class="twoLevel">
                            <a href="product.html">产品与解决方案</a>
                            <span></span>
                        </li>
                        <li>
                            <a href="service.html">服务支持</a>
                        </li>
                        <li>
                            <a href="information.html">小锋资讯</a>
                        </li>
                        <li>
                            <a href="employ.html">诚聘英才</a>
                        </li>
                        <li>
                            <a href="about.html">关于小锋传媒</a>
                        </li>
                    </ul>
                </div>
            </div>
<@block name="body"></@block>

            <div class="footer ">
                <div class="auto clear">
                    <dl>
                        <dt><a href="#">关于我们</a></dt>
                    </dl>
                    <dl>
                        <dt><a href="#">公司简介</a></dt>
                    </dl>
                    <dl>
                        <dt><a href="#">人才招聘</a></dt>
                    </dl>
                    <dl class="img">
                        <dt>联系我们</dt>
                        <dd>北京市房山区</dd>
                        <dd>021-50530133</dd>
                        <dd>Connact@levelaprro.com</dd>
                    </dl>
                </div>
                <p class="copyrigt">copyright ©2018北京小锋文化传媒有限公司 备案号：XXXXXXX</p>
            </div>
        </div>
    </div>
 <@block name="tail"></@block>
    <script type="text/javascript" src="js/jquery-1.12.1.min.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
</body>

</html>