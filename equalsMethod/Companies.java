import java.util.*;
/**
 * Write a description of class Companies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Companies
{
    // instance variables - replace the example below with your own
    private String compName;
    private String category;

    /**
     * Constructor for objects of class Companies
     */
    public Companies()
    {
        compName = "";
        category = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getCompName()
    {
        return compName;
    }

    public void setCompName(String name)
    {
        compName = name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String categoryName)
    {
        category = categoryName;
    }

    public boolean equals(Object obj)
    {
        if (this == obj){
            return true;
        }
        if (! (obj instanceof Companies)){
            return false;
        }
        Companies comp = (Companies) obj;
        if (comp.getCompName().equals(getCompName()) && comp.getCategory().equals(getCategory())){
            return true;
        }
        return false;
    }
}