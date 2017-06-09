package test;

import org.seasar.doma.jdbc.tx.TransactionManager;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("SSSSSStart");
    SimpleDao dao = new SimpleDaoImpl();
    TransactionManager tm = AppConfig.singleton().getTransactionManager();
    tm.required(() -> {
    Sample sample = dao.find(1);
    sample.setName("CNTD");
    dao.update(sample);
    });

  }
}
