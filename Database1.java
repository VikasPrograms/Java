// Reduced code.

import java.sql.*;      // 1

class Database1
{
    public static void main(String arg[]) throws Exception
    {
        Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa41", "root", "root");     // 2
        
        // Error (not install mysql driver)

        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery("select * from Student");      // 4

        while(robj.next())      // 5
        {
            System.out.println("RID : "+robj.getInt("RID"));
            System.out.println("Name : "+robj.getInt("Name"));
            System.out.println("City : "+robj.getInt("City"));
            System.out.println("Marks : "+robj.getInt("Marks"));
        }
    }
}


// execute()            create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert