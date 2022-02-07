package chap12.etc.blogTest;


import java.util.ArrayList;
import java.util.Collection;

public class BlogTest {
  public static void main(String[] args) {
    Collection<BlogParentsClass> ps = new ArrayList<>();
    BlogParentsClass blogParentsClass =  new BlogParentsClass();
    ps.add(blogParentsClass);
    blogParentsClass.myName();



    Collection<BlogChildClass> cs = new ArrayList<>();
    BlogChildClass blogChildClass = new BlogChildClass();
    cs.add(blogChildClass);
    blogChildClass.myName();


    Collection<BlogParentsClass> pcs = new ArrayList<>();
    BlogParentsClass blogParentsClass1 = new BlogChildClass();
    pcs.add(blogParentsClass1);
    blogParentsClass1.myName();
  }


}
