<%-- 
    Document   : UserManager
    Created on : Mar 7, 2023, 9:12:33 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">


        <title>User list page - Bootdey.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/account.css" rel="stylesheet">
    </head>
    <body>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="main-box clearfix">
                        <div class="table-responsive">
                            <table class="table user-list">
                                <thead>
                                    <tr>
                                        <th><span>User</span></th>
                                        <th><span>Created</span></th>
                                        <th class="text-center"><span>Status</span></th>
                                        <th><span>Email</span></th>
                                        <th>&nbsp;</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar1.png" alt="">
                                            <a href="#" class="user-link">Mila Kunis</a>
                                            <span class="user-subhead">Admin</span>
                                        </td>
                                        <td>
                                            2013/08/08
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-default">Inactive</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="d2bfbbbeb392b9a7bcbba1fcb1bdbf">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="">
                                            <a href="#" class="user-link">George Clooney</a>
                                            <span class="user-subhead">Member</span>
                                        </td>
                                        <td>
                                            2013/08/12
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-success">Active</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="4d202c3f2122230d2f3f2c232922632e2220">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar3.png" alt="">
                                            <a href="#" class="user-link">Ryan Gossling</a>
                                            <span class="user-subhead">Registered</span>
                                        </td>
                                        <td>
                                            2013/03/03
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-danger">Banned</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="8ee4efede5cee0e7ede6e1e2fde1e0">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar4.png" alt="">
                                            <a href="#" class="user-link">Emma Watson</a>
                                            <span class="user-subhead">Registered</span>
                                        </td>
                                        <td>
                                            2004/01/24
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-warning">Pending</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="721a071f021a00170b32101d151300065c111d1f">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar5.png" alt="">
                                            <a href="#" class="user-link">Robert Downey Jr.</a>
                                            <span class="user-subhead">Admin</span>
                                        </td>
                                        <td>
                                            2013/12/31
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-success">Active</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="b0c3c0d5ded3d5c2f0c4c2d1d3c9">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar6.png" alt="">
                                            <a href="#" class="user-link">Mila Kunis</a>
                                            <span class="user-subhead">Admin</span>
                                        </td>
                                        <td>
                                            2013/08/08
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-default">Inactive</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="75181c1914351e001b1c065b161a18">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="">
                                            <a href="#" class="user-link">George Clooney</a>
                                            <span class="user-subhead">Member</span>
                                        </td>
                                        <td>
                                            2013/08/12
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-success">Active</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="dbb6baa9b7b4b59bb9a9bab5bfb4f5b8b4b6">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar1.png" alt="">
                                            <a href="#" class="user-link">Ryan Gossling</a>
                                            <span class="user-subhead">Registered</span>
                                        </td>
                                        <td>
                                            2013/03/03
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-danger">Banned</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="e389828088a38d8a808b8c8f908c8d">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar1.png" alt="">
                                            <a href="#" class="user-link">Emma Watson</a>
                                            <span class="user-subhead">Registered</span>
                                        </td>
                                        <td>
                                            2004/01/24
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-warning">Pending</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="137b667e637b61766a53717c747261673d707c7e">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <img src="https://bootdey.com/img/Content/avatar/avatar6.png" alt="">
                                            <a href="#" class="user-link">Robert Downey Jr.</a>
                                            <span class="user-subhead">Admin</span>
                                        </td>
                                        <td>
                                            2013/12/31
                                        </td>
                                        <td class="text-center">
                                            <span class="label label-success">Active</span>
                                        </td>
                                        <td>
                                            <a href="#"><span class="__cf_email__" data-cfemail="a6d5d6c3c8c5c3d4e6d2d4c7c5df">[email&#160;protected]</span></a>
                                        </td>
                                        <td style="width: 20%;">
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link">
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                            <a href="#" class="table-link danger"> 
                                                <span class="fa-stack">
                                                    <i class="fa fa-square fa-stack-2x"></i>
                                                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                                                </span>
                                            </a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <ul class="pagination pull-right">
                            <li><a href="#"><i class="fa fa-chevron-left"></i></a></li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#"><i class="fa fa-chevron-right"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <script src="https://netdna.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script type="text/javascript">

        </script>
    </body>
</html>
