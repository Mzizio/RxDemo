package rxdemo.endpoints;

import spark.servlet.SparkApplication;
//initial check
public class RxDemoServerApplication implements SparkApplication {
    @Override
    public void init() {
        RxEndpoints.initalizeEndpoints();
    }
}
