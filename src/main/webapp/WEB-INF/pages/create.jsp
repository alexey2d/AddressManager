<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 15.05.2016
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div>
    <form action="/address/create" method="post" id="add-address">
        <table border="1px" style="color: black">
            <tr>
                <td  align="center" >content:</td>
                <td  align="center" ><input type="text" value="" name="content"></td>
            </tr>
            <tr>
                <td  align="center" >phones:</td>
                <td  align="center" ><input type="text" value="" name="phones"></td>
            </tr>
            <tr>
                <td  align="center" >country:</td>
                <td  align="center" >
                    <select name="country">
                        <option selected value="UKRAINE">UKRAINE</option>
                        <option value="GERMANY">GERMANY</option>
                        <option value="RUSSIAN_FEDERATION">RUSSIAN FEDERATION</option>
                        <option value="UNITED_KINGDOM">UNITED KINGDOM</option>
                        <option value="UNITED_STATES">UNITED STATES</option>
                    </select>
                </td>
            </tr>
            <tr >
                <td rowspan="4" align="center" > <input type="submit"></td>
            </tr>
        </table>
    </form>
</div>