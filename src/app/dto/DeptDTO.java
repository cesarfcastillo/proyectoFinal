    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dto;

/**
 *
 * @author fcastillo
 */
public class DeptDTO
{

    private int deptno;
    private String dname;
    private String loc;

    public String toString()
    {
        return deptno + ", " + dname + ", " + loc;
    }

    public int getDeptno()
    {
        return deptno;
    }

    public void setDeptno(int deptno)
    {
        this.deptno = deptno;
    }

    public String getDname()
    {
        return dname;
    }

    public void setDname(String dname)
    {
        this.dname = dname;
    }

    public String getLoc()
    {
        return loc;
    }

    public void setLoc(String loc)
    {
        this.loc = loc;
    }
    
    

}
