package ir.hajitsu.prototype;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;

import static org.junit.jupiter.api.Assertions.*;

class StatementTest {
    @Test
    public static void main(String[] args) {
        Statement statement = Statement.getBuilder().setFrom("FROM EMPLOYEE")
                .setProject("SELECT FIRST_NAME, LAST_NAME")
                .setWhere("ID=1")
                .createStatement();
        System.out.println(statement.hashCode());

        Statement clone = statement.clone();
        System.out.println(clone.hashCode());
    }
}