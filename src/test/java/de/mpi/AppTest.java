package de.mpi;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testHttpClient() {    /*
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://www.test.de");


       try {
           CloseableHttpResponse response1 = httpclient.execute(httpGet);



// The underlying HTTP connection is still held by the response object
// to allow the response content to be streamed directly from the network socket.
// In order to ensure correct deallocation of system resources
// the user MUST call CloseableHttpResponse#close() from a finally clause.
// Please note that if response content is not fully consumed the underlying
// connection cannot be safely re-used and will be shut down and discarded
// by the connection manager.

      //      System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();
            // do something useful with the response body
            // and ensure it is fully consumed
//            EntityUtils.consume(entity1);
            System.out.println( "++++++++++++\n" +  EntityUtils.toString(entity1) + "\n++++++++++++"                );

            System.out.println("++++++++++++\n" +  response1.toString() + "\n++++++++++++");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void viaMethod(){
        HttpMethod method = new GetMethod("http://www.apache.org/");
        try {
            byte[] responseBody = method.getResponseBody();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /*
    @Test
       public void testWithConnection(){
        try
        {
            HTTPConnection con = new HTTPConnection("www.myaddr.net");
            HTTPResponse   rsp = con.Get("/my/file");
            if (rsp.getStatusCode() >= 300)
            {
                System.err.println("Received Error: "+rsp.getReasonLine());
                System.err.println(rsp.getText());
            }
    }
        */
 /*   @Test
    public void ggg() {
        assertTrue("false".equals("false"));
        assertEquals("false", "false");     */
    }

}
