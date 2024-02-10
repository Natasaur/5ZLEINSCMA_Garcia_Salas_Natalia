/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakeg
 */
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.JOptionPane;

public class PlantillaPDF {
    private String modelo,fecha;
    private int numReporte,muestreoPrendas;
    private List<Fila> listaResultados;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public PlantillaPDF(){
    }
    
    public PlantillaPDF(
            String modelo,
            String fecha,
            int numReporte,
            int muestreoPrendas,
            List listaResultados){
        this.modelo = modelo;
        this.fecha = fecha;
        this.numReporte = numReporte;
        this.muestreoPrendas = muestreoPrendas;
        this.listaResultados = listaResultados;
        
        documento = new Document();
        titulo = new Paragraph("Inspección de Medidas");
    }
    
    public void crearPlantilla(){
        try{
            archivo = new FileOutputStream(this.getModelo() + ".pdf");
            PdfWriter.getInstance(documento,archivo);
            documento.open();
            titulo.setAlignment(1);
            
            documento.add(titulo);
            documento.add(new Paragraph("Modelo: " + this.getModelo() + "   "
                    +"Número de Reporte: " + this.getNumReporte() + "   "
                    +"Fecha de Inspección: " + this.getFecha()));
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(14);
            tabla.setWidthPercentage(100);
            PdfPCell puntos = new PdfPCell(new Phrase("Puntos a medir"));
            puntos.setBorder(1);
            puntos.setBackgroundColor(BaseColor.BLUE);
            PdfPCell std = new PdfPCell(new Phrase("std"));
            std.setBorder(1);
            std.setBackgroundColor(BaseColor.BLUE);
            PdfPCell tol = new PdfPCell(new Phrase("tol"));
            tol.setBorder(1);
            tol.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v1 = new PdfPCell();
            v1.setBorder(1);
            v1.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v2 = new PdfPCell();
            v2.setBorder(1);
            v2.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v3 = new PdfPCell();
            v3.setBorder(1);
            v3.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v4 = new PdfPCell();
            v4.setBorder(1);
            v4.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v5 = new PdfPCell();
            v5.setBorder(1);
            v5.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v6 = new PdfPCell();
            v6.setBorder(1);
            v6.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v7 = new PdfPCell();
            v7.setBorder(1);
            v7.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v8 = new PdfPCell();
            v8.setBorder(1);
            v8.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v9 = new PdfPCell();
            v9.setBorder(1);
            v9.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v10 = new PdfPCell();
            v10.setBorder(1);
            v10.setBackgroundColor(BaseColor.BLUE);
            PdfPCell total = new PdfPCell(new Phrase("Total"));
            total.setBorder(1);
            total.setBackgroundColor(BaseColor.BLUE);
            
            tabla.addCell(puntos);
            tabla.addCell(std);
            tabla.addCell(tol);
            tabla.addCell(v1);
            tabla.addCell(v2);
            tabla.addCell(v3);
            tabla.addCell(v4);
            tabla.addCell(v5);
            tabla.addCell(v6);
            tabla.addCell(v7);
            tabla.addCell(v8);
            tabla.addCell(v9);
            tabla.addCell(v10);
            tabla.addCell(total);
            
            for(Fila fila: listaResultados){
                tabla.addCell(fila.getPuntoAMedir());
                tabla.addCell(fila.getStd());
                tabla.addCell(fila.getTol());
                tabla.addCell(fila.getV1()+"");
                tabla.addCell(fila.getV2()+"");
                tabla.addCell(fila.getV3()+"");
                tabla.addCell(fila.getV4()+"");
                tabla.addCell(fila.getV5()+"");
                tabla.addCell(fila.getV6()+"");
                tabla.addCell(fila.getV7()+"");
                tabla.addCell(fila.getV8()+"");
                tabla.addCell(fila.getV9()+"");
                tabla.addCell(fila.getV10()+"");
                tabla.addCell(fila.getTotal()+"");
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showConfirmDialog(null,"PDF creado correctamente");
            
            
            
        }catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumReporte() {
        return numReporte;
    }
    public void setNumReporte(int numReporte) {
        this.numReporte = numReporte;
    }

    public int getMuestreoPrendas() {
        return muestreoPrendas;
    }
    public void setMuestreoPrendas(int muestreoPrendas) {
        this.muestreoPrendas = muestreoPrendas;
    }

    public List<Fila> getListaResultados() {
        return listaResultados;
    }

    public void setListaResultados(List<Fila> listaResultados) {
        this.listaResultados = listaResultados;
    }
}
