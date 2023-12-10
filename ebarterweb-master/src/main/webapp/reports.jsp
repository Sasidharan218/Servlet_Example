<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>Reports</h1>
    <a href="home.jsp">|Home|</a><br><br>
    reports
    <a href="/reports">|reports|</a><br>
    <br><br><br>
    <!-- <h3>Total Brokerage for a day: </h3>${sum1} -->
    <form action="reports.jsp" method="get">
        <table border="1">
            <tr class="row">
                <td class="col">Top Buy scrip in a month by Netamount </td>
                <td class="col">        </td>
            </tr>

            <tr class="row">
                <td class="col">Top Sell scrip in a month by Netamount </td>
                <td class="col">          </td>
            </tr>

            <tr class="row">
                <td class="col">Top Turnover scrip </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Low Turnover scrip </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Net pay for each person for given date </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col"> Total Brokerage for a day </td>
                <td class="col"> ${sum1}   </td>
            </tr>

            <tr class="row">
                <td class="col">Highest Brokerage collection </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Avg Buy price per scrip </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Avg Sell price per scrip </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Total Brokerage for a person </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Highest Brokerage paid on wich date by a person </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Current holding for a person / day </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Who is holding highest share </td>
                <td class="col"> </td>
            </tr>

            <tr class="row">
                <td class="col">Who is doing tranaction on every day</td>
                <td class="col"> </td>
            </tr>

        </table>
    </form>
</body>
</html>