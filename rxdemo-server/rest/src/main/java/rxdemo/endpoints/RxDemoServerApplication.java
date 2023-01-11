package rxdemo.endpoints;

import spark.servlet.SparkApplication;
//initial check now
public class RxDemoServerApplication implements SparkApplication {
    @Override
    public void init() {
        RxEndpoints.initalizeEndpoints();
    }
}
