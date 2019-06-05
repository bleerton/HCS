/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
    import java.text.SimpleDateFormat;  
import java.util.Date;  
/**
 *
 * @author Enis
 */
public class damnclass {


public static void main(String[] args)throws Exception {  
    String sDate1="31/12/1998";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+"\t"+date1);  
}  
}