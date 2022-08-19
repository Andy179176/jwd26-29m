// CPU nested static class

public class Phone {
    public static final String CATEGORY="Mobile phone";
    private String name;
    private CPU cpu;

    public Phone(String name, CPU cpu) {
        this.name = name;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                '}';
    }

    static class CPU{
        private String name;
        int core;

        public CPU(String name, int core) {
            this.name = name;
            this.core = core;

        }

        @Override
        public String toString() {
            return "CPU{" +
                    "name='" + name + '\'' +
                    ", core=" + core +
                    '}';
        }
    }
}


