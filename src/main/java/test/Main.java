package test;

import org.seasar.doma.jdbc.tx.TransactionManager;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("SSSSSStart");
    SimpleDao dao = new SimpleDaoImpl();
    TransactionManager tm = AppConfig.singleton().getTransactionManager();
    //required トランザクション属性がREQUIREDであるトランザクションを実行します
    tm.required(() -> {
      List<Sample> samples = dao.findAll();
      for(Sample s : samples) {
        System.out.println(s.toString());
      }

      System.out.println("----------");

      Sample sample = dao.find(1);//
      System.out.println(sample.toString());

      System.out.println("EEEEEEEnd");
    });
  }
}
