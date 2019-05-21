package ml.dhoomilsheta.app.config;

public class KafkaConfiguration {
    public static final String SERVERS = "stock-1:9092, stock-2:9092, stock-3:9092";
    public static final String TOPIC = "stock-tweets";
    public static final long SLEEP_TIMER = 1000;
}
