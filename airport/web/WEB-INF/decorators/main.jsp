<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <title><decorator:title default="National Credit Rating Agency Database"/></title>

    <link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/css/style_s.css"/>'/>

    <script type="text/javascript" src="<c:url value='/js/jquery-1.4.4.min.js'/>"></script>
    <link rel="stylesheet" type="text/css" href='<c:url value="/css/jquery-ui-1.8.7.custom.css"/>'/>
    <link rel="stylesheet" type="text/css" href='<c:url value="/css/jquery.wysiwyg.css"/>' />

    <script src="<c:url value='/js/jquery.prettyPhoto.js'/>"   type="text/javascript" charset="utf-8"></script>


    <%--date picker--%>
    <script type="text/javascript" src="<c:url value='/js/jquery-ui-1.8.7.custom.min.js'/>"></script>
    <script type="text/javascript">
        $(function () {
            $("#datepicker1").datepicker({ dateFormat: 'dd-mm-yy' });
        });
    </script>

    <decorator:head/>
</head>

<body id="top" class='fullwidth'>

<%--<div class="wrapper" id='wrapper_head'>

    <div class="center">

        <div id="head">

            <ul id="nav">
                &lt;%&ndash;<li><a href="index.jsp" class="parent"><span>Home</span></a></li>&ndash;%&gt;

                <li>
                    <a href="#" class="parent"><span>Features</span></a>
                    <ul>
                        <li>
                            <a href="#"><span>Departments</span></a>
                            <ul>
                                <li><a href=""><span>Development</span></a>
                                    <ul>
                                        <li><a href=""><span>Team Leader</span></a>
                                        <li><a href=""><span>2nd Man</span></a>
                                        <li><a href=""><span>3rd man</span></a>
                                    </ul>
                                </li>
                                <li><a href=""><span>Design</span></a>
                                    <ul>
                                        <li><a href=""><span>Team Leader</span></a>
                                        <li><a href=""><span>2nd Man</span></a>
                                        <li><a href=""><span>3rd man</span></a>
                                    </ul>
                                </li>
                                <li><a href=""><span>Unix</span></a>
                                    <ul>
                                        <li><a href=""><span>Team Leader</span></a>
                                        <li><a href=""><span>2nd Man</span></a>
                                        <li><a href=""><span>3rd man</span></a>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="#"><span>Offices</span></a>
                            <ul>
                                <li><a href=""><span>US</span></a></li>
                                <li><a href=""><span>BD</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" class="parent"><span>Level</span></a>
                    <ul>
                        <li><a href=""><span>1st Class</span></a></li>
                        <li><a href=""><span>2nd Class</span></a></li>
                        <li><a href=""><span>3rd Class</span></a></li>
                        <li><a href=""><span>4th Class</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="" class="parent"><span>Feedback</span></a>

                </li>

                <li class="last"><a href=""><span>About Authors</span></a>
                    <ul>
                        <li><a href=""><span>Misbah</span></a></li>
                        <li><a href=""><span>Sami</span></a></li>
                        <li><a href=""><span>Mubin</span></a></li>
                        <li><a href=""><span>Shohan</span></a></li>
                    </ul>
                </li>
            </ul>
            <!--end head-->
        </div>

        <!-- end center-->
    </div>
    <!--end wrapper-->
</div>

<div class="wrapper" id='wrapper_featured_area'>

    <div class="center">

        <!-- ###################################################################### -->
        <div class="feature_wrap">
            <div class=' featured_inside blockslider'>
                <span class='fancyborder ie6fix fancyborder_top'></span>
                <span class='fancyborder ie6fix fancyborder_left'></span>
                <span class='fancyborder ie6fix fancyborder_right'></span>
                <span class='fancyborder ie6fix fancyborder_bottom'></span>

                <div class="featured featured1">
                    <img src="images/banner.jpg"/>
                </div>
                <!-- end .featured1 -->


            </div>
            <!-- end .featured_inside -->

            <!-- ###################################################################### -->
        </div>
        <!-- end featuredwrap -->
        <!-- ###################################################################### -->

        <!-- end center-->
    </div>

    <!--end wrapper-->
</div>--%>

<table>
    <tr>
        <td>Home</td>
        <td></td>
    </tr>
</table>


<decorator:body/>
<%--<%@ include file="footer.jsp" %>--%>
<br/><br/>
<div id="footer">
    <p>
        <a href="index.jsp">HOME</a> |
        <a href="#">ABOUT US</a> |
        <a href="#">CONTACTS</a><br/>
        <span>&copy; Copyright 2011 National Credit Rating Agency</span>
    </p>

</div>
</body>

</html>
