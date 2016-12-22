package de.mpi;



/**
 * Created by MPi on 23.02.2016.
 */
public class HeaderFooterPageEvent{/* extends PdfPageEventHelper {
    public void onStartPage(PdfWriter writer, Document document) {
        Rectangle rect = writer.getBoxSize("art");
//        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase(document.getPageNumber()+" Top Left"), rect.getLeft(), rect.getTop(), 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase(document.getPageNumber() + " Top Left"),0, rect.getTop(), 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_RIGHT, new Phrase("Top Right"), rect.getRight(), rect.getTop(), 0);
    }

    public void onEndPage(PdfWriter writer, Document document) {
        Rectangle rect = writer.getBoxSize("art");
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Bottom Left"), rect.getLeft(), rect.getBottom(), 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Bottom Right"), rect.getRight(), rect.getBottom(), 0);
    }       */
}
