package ir.hajitsu.prototype;

public class Statement implements Cloneable {
    private String project;
    private String from;
    private String where;
    private String groupBy;
    private String orderBy;
    private Record record;

    public static StatementBuilder getBuilder() {
        return new StatementBuilder();
    }

    public Statement(String project, String from, String where, String groupBy, String orderBy, Record record) {
        this.project = project;
        this.from = from;
        this.where = where;
        this.groupBy = groupBy;
        this.orderBy = orderBy;
        this.record = record;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static class StatementBuilder {
        private String project;
        private String from;
        private String where;
        private String groupBy;
        private String orderBy;
        private Record record;

        public StatementBuilder setProject(String project) {
            this.project = project;
            return this;
        }

        public StatementBuilder setFrom(String from) {
            this.from = from;
            return this;
        }

        public StatementBuilder setWhere(String where) {
            this.where = where;
            return this;
        }

        public StatementBuilder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public StatementBuilder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public StatementBuilder setRecord(Record record) {
            this.record = record;
            return this;
        }

        public Statement createStatement() {
            return new Statement(project, from, where, groupBy, orderBy, record);
        }
    }
}
