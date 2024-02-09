/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakeg
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class GeneradorPDF {
    public static void generarPDF(Prenda prenda, Operador operador, String descripcion, String[] valores) {
        try {
            Document document = new Document();
            FileOutputStream fos = new FileOutputStream("prueba.pdf");
            PdfWriter.getInstance(document, fos);
            document.open();
            document.add(new Paragraph("Datos de la Prenda:"));
            document.add(new Paragraph("Nombre: " + prenda.getNombre()));
            document.add(new Paragraph("Modelo: " + prenda.getModelo()));
            document.add(new Paragraph("Datos del Operador:"));
            document.add(new Paragraph("Nombre: " + operador.getNombre()));
            document.add(new Paragraph("ID: " + operador.getId()));
            document.add(new Paragraph("Descripción: " + descripcion));
            document.add(new Paragraph("Valores Decimales:"));
            for (String valor : valores) {
                document.add(new Paragraph(valor));
            }
            document.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
