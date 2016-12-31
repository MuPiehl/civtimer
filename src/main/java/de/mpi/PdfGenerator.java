package de.mpi;



import java.io.*;

/**
 * Created by MPi on 23.02.2016.
 */
public class PdfGenerator {
    public static void main(String[] args) {
        try {

            String k = "<html><body><h1>This is my</h1>Project<h1>Add Header and Footer in PDF Using iText in Java</h1>\n" +
                    "<div class=\"date\">February 08, 2015</div>\n" +
                    "\n" +
                    "This page will provide the tutorial for how to add header and footer in every page of PDF using iText in java.  iText provides PdfPageEventHelper class that has different event methods that is called while writing PDF. To add header and footer we need to create a class extending PdfPageEventHelper and override  <b>onStartPage</b> and <b>onEndPage </b> methods. Register this class with  PdfWriter. Find the complete explanation as below.\n" +
                    "\n" +
                    "<h3>Create an Event Class Extending PdfPageEventHelper</h3>\n" +
                    "PdfPageEventHelper class has different event methods for PDF. It implements PdfPageEvent interface. Some  event methods of PdfPageEventHelper are as below\n" +
                    "<br/><br/>onOpenDocument\n" +
                    "<br/>onStartPage\n" +
                    "<br/>onEndPage\n" +
                    "<br/>onCloseDocument\n" +
                    "<br/>onParagraph\n" +
                    "<br/>onParagraphEnd\n" +
                    "<br/><br/> To add header and footer, we need to override <b>onStartPage</b> and <b>onEndPage </b> methods. While defining these methods we do not need to use Document.add() method. To get the location for header and footer, we need to create a rectangle and  get location by  using Rectangle.getLeft, Rectangle.getRight, Rectangle.getTop and Rectangle.getBottom methods. We can use ColumnText to format text in column wise. For every page creation these events will be hit and perform the action as defined.\n" +
                    "\n" +
                    "<br/><b>HeaderFooterPageEvent.java</b>\n" +
                    "<div class=\"preBg\">\n" +
                    "   <span class=\"topLeft\"></span><span class=\"topRight\"></span><span class=\"bottomLeft\"></span><span class=\"bottomRight\"></span>\n" +
                    " <pre class=\"pre\">\n" +
                    "package com.concretepage;\n" +
                    "import com.itextpdf.text.Document;\n" +
                    "import com.itextpdf.text.Element;\n" +
                    "import com.itextpdf.text.Phrase;\n" +
                    "import com.itextpdf.text.Rectangle;\n" +
                    "import com.itextpdf.text.pdf.ColumnText;\n" +
                    "import com.itextpdf.text.pdf.PdfPageEventHelper;\n" +
                    "import com.itextpdf.text.pdf.PdfWriter;\n" +
                    "public class HeaderFooterPageEvent extends PdfPageEventHelper {\n" +
                    "    public void onStartPage(PdfWriter writer,Document document) {\n" +
                    "    \tRectangle rect = writer.getBoxSize(\"art\");\n" +
                    "        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase(\"Top Left\"), rect.getLeft(), rect.getTop(), 0);\n" +
                    "        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase(\"Top Right\"), rect.getRight(), rect.getTop(), 0);\n" +
                    "    }\n" +
                    "    public void onEndPage(PdfWriter writer,Document document) {\n" +
                    "    \tRectangle rect = writer.getBoxSize(\"art\");\n" +
                    "        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase(\"Bottom Left\"), rect.getLeft(), rect.getBottom(), 0);\n" +
                    "        ColumnText.showTextAligned(writer.getDirectContent(),Element.ALIGN_CENTER, new Phrase(\"Bottom Right\"), rect.getRight(), rect.getBottom(), 0);\n" +
                    "    }\n" +
                    "} </pre>\n" +
                    "</div>" +
                    "Run the example and we will get a PDF of two page with header and footer text on each page.\n" +
                    "\n<div class=\"bottomAdd\">\n" +
                    "\t<div class=\"imgcenter\"><!-- Begin Adversal 728x90 - concretepage.com Code -->\n" +
                    "<script src=\"http://go.adversal.com/ttj?id=2124208&amp;size=728x90&amp;promo_sizes=468x60,320x50,300x50,216x36\" type=\"text/javascript\"></script><img width=\"0\" height=\"0\" style=\"display: block; margin: 0px; padding: 0px; width: 0px;\" /><script language=\"javascript\" src=\"http://ib.adnxs.com/ttj?ttjb=1&amp;bdc=1456265211&amp;bdh=_L2cgar7vmVZyJ_h6UPXvI6z2kE.&amp;&amp;view_iv=0&amp;view_pos=388,1346&amp;view_ws=1920,995&amp;view_vs=3&amp;bdref=http%3A%2F%2Fwww.concretepage.com%2Fitext%2Fadd-header-and-footer-in-pdf-using-itext-in-java&amp;bdtop=true&amp;bdifs=0&amp;bstk=http%3A%2F%2Fwww.concretepage.com%2Fitext%2Fadd-header-and-footer-in-pdf-using-itext-in-java&amp;&amp;id=2124208&amp;size=728x90&amp;promo_sizes=468x60,320x50,300x50,216x36\"></script><!-- Creative 10275740 served by Member 1756 via AppNexus. --><img width=\"0\" height=\"0\" style=\"display: block; margin: 0px; padding: 0px; width: 0px;\" /><div lnttag=\";tv=view5-1;d=728x90;s=581888;samp=1;vc=iab;url=http%3A%2F%2Fwww.concretepage.com%2Fitext%2Fadd-header-and-footer-in-pdf-using-itext-in-java;cb=http%3A%2F%2Ffra1.ib.adnxs.com%2Fvevent%3Fe%3DwqT_3QLYAqhPAQAAAgDWAAUI-6-ztgUQ4-u_1vf3uvtfGJbvp6y9h6_QVCABKi0JAAAABQIAEQUGFAAAABmamQEBCANAIQEOAQEAKQEFAQH0AwEwsNOBATjcDUDcDUgCUJyX8wRYivUUYABo_NkDeACAAQGSAQNVU0SYAdgFoAFaqAEAsAEAuAECwAECyAEA0AEA2AEA4AEA8AEA2AKxBeAC8uEr6gJSaHR0cDovL3d3dy5jb25jcmV0ZXBhZ2UuY29tL2l0ZXh0L2FkZC1oZWFkZXItYW5kLWZvb3Rlci1pbi1wZGYtdXNpbmctaXRleHQtaW4tamF2YYADAYgDAZADAJgDAKADAaoDALADALgDAMADrALIAwDYA7PcTeADAOgDAPgDAYAEAJIEBC90dGqYBACiBA0yMTcuMjM4LjYzLjQ0qATThgmyBAgIABAAGAAgALgEAA..%26s%3Df27d7f60ebb2d1a71b2000b1213f13af43c10da8%26referrer%3Dhttp%253A%252F%252Fwww.concretepage.com%252Fitext%252Fadd-header-and-footer-in-pdf-using-itext-in-java\" style=\"display:none\"></div><script type=\"text/javascript\" async=\"true\" src=\"http://cdn.adnxs.com/v/s/33/trk.js\"></script><script type=\"text/javascript\"><!--\n" +
                    "google_ad_client = \"ca-pub-6501869297153847\";\n" +
                    "/* Computers & Electronics-728x90 */\n" +
                    "google_ad_slot = \"8092742529\";\n" +
                    "google_ad_width = 728;\n" +
                    "google_ad_height = 90;\n" +
                    "//-->\n" +
                    "</script>\n" +
                    "<script type=\"text/javascript\" src=\"//pagead2.googlesyndication.com/pagead/show_ads.js\">\n" +
                    "</script><ins id=\"aswift_0_expand\" style=\"display:inline-table;border:none;height:90px;margin:0;padding:0;position:relative;visibility:visible;width:728px;background-color:transparent\"><ins id=\"aswift_0_anchor\" style=\"display:block;border:none;height:90px;margin:0;padding:0;position:relative;visibility:visible;width:728px;background-color:transparent\"><iframe width=\"728\" height=\"90\" frameborder=\"0\" marginwidth=\"0\" marginheight=\"0\" vspace=\"0\" hspace=\"0\" allowtransparency=\"true\" scrolling=\"no\" allowfullscreen=\"true\" onload=\"var i=this.id,s=window.google_iframe_oncopy,H=s&amp;&amp;s.handlers,h=H&amp;&amp;H[i],w=this.contentWindow,d;try{d=w.document}catch(e){}if(h&amp;&amp;d&amp;&amp;(!d.body||!d.body.firstChild)){if(h.call){setTimeout(h,0)}else if(h.match){try{h=s.upd(h,i)}catch(e){}w.location.replace(h)}}\" id=\"aswift_0\" name=\"aswift_0\" style=\"left:0;position:absolute;top:0;\"></iframe></ins></ins> <script src=\"http://cdn.adnxs.com/ib/async_usersync.js\"></script>\n" +
                    "<!-- End Adversal 728x90 - concretepage.com Code --></div>\t<div class=\"cl\"></div>\n" +
                    "</div>" +
                    "<div class=\"imgcenter\">\n" +
                    "<img src=\"https://tpc.googlesyndication.com/simgad/7682929279534932056\" border=\"0\" width=\"728\" alt=\"\" class=\"img_ad\" onload=\"\"/>" +
                    "  <img src=\"images/add-header-and-footer-in-pdf-using-itext-in-java.jpg\" alt=\"Add Header and Footer in PDF Using iText in Java\" title=\"Add Header and Footer in PDF Using iText in Java\" />\n" +
                    "</div>\n" +
                    "\n" +
                    "\n" +

                    "<style>.fl{ float:left;}\n" +
                    ".sharebtn{ margin:0 10px 0 0px;}\n" +
                    ".shareButton{margin-top:15px;}\n" +
                    "</style>\n" +
                    "<div class=\"shareButton\">\n" +
                    "  \n" +
                    " <div class=\"fl sharebtn\"> \n" +
                    "    <div class=\"fb-share-button\" data-href=\"\" data-layout=\"button_count\"></div>\n" +
                    " </div>\n" +
                    " \n" +
                    " <div class=\"fl sharebtn\">\n" +
                    "     <a href=\"https://twitter.com/share\" class=\"twitter-share-button\" data-dnt=\"true\" data-count=\"horizontal\" data-via=\"twitterapi\">Tweet</a>\n" +
                    "  </div>\n" +
                    "    \n" +
                    "  <div class=\"fl sharebtn\">\n" +
                    "    <script src=\"//platform.linkedin.com/in.js\" type=\"text/javascript\"> lang: en_US\t</script>\n" +
                    "\t<script type=\"IN/Share\" data-counter=\"right\"></script>\n" +
                    "  </div>\n" +
                    "  \n" +
                    "  <div class=\"fl sharebtn\">\n" +
                    "\t <div class=\"g-plusone\" data-size=\"medium\" data-href=\"\" ></div>\n" +
                    "\t <script type=\"text/javascript\">gapi.plusone.go();</script>\n" +
                    "   </div>\n" +
                    "   \n" +
                    "  <div class=\"fl sharebtn\">\n" +
                    "   <div class=\"g-follow\" data-href=\"https://plus.google.com/u/0/b/105713740877076978619/+Concretepage\" data-rel=\"author\"></div>\n" +
                    "  </div> \n" +
                    "  \n" +
                    "  <div class=\"cl\"></div>\n" +
                    "</div>" +
                    "</body></html>";
     /*
            OutputStream file = new FileOutputStream(new File("D:\\Test.pdf"));

            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, file);

            Rectangle rect = new Rectangle(30, 30, 550, 800);
            writer.setBoxSize("art", rect);
            HeaderFooterPageEvent event = new HeaderFooterPageEvent();
            writer.setPageEvent(event);

            document.open();

            //      document.add(new Paragraph(k));


//            HTMLWorker htmlWorker = new HTMLWorker(document);
//            htmlWorker.parse(new StringReader(k));


//            PdfPHeaderCell pdfPHeaderCell = new PdfPHeaderCell();
//            pdfPHeaderCell.addElement(new Paragraph("mein Header hier"));
//            document.add(pdfPHeaderCell);

            InputStream is = new ByteArrayInputStream(k.getBytes());
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);

            document.newPage();
            document.add(new Paragraph("Zweite Seite (!)"));

            document.close();
            file.close();
           */
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
