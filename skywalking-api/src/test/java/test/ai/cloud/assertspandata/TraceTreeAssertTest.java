package test.ai.cloud.assertspandata;

import com.ai.cloud.skywalking.buffer.ContextBuffer;
import com.ai.cloud.skywalking.conf.Config;
import com.ai.cloud.skywalking.protocol.Span;
import org.junit.Test;
import test.com.ai.skywalking.test.api.TraceTreeAssert;

/**
 * Created by xin on 16-6-6.
 */
public class TraceTreeAssertTest {

    @Test
    public void traceTreeAssertTest() {
        Config.Consumer.MAX_CONSUMER = 0;
        Span testSpan = new Span("1.0b.1465224457414.7e57f54.22905.61.2691", "", 0, "test-application", "5");
        testSpan.setViewPointId("http://hire.asiainfo.com/Aisse-Mobile-Web/aisseWorkPage/submitReimbursement");
        ContextBuffer.save(testSpan);
        TraceTreeAssert.assertEquals(new String[][]{
                {null, "0", "http://hire.asiainfo.com/Aisse-Mobile-Web/aisseWorkPage/submitReimbursement", null}
        });

    }
}
