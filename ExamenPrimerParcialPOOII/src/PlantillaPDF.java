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
    int tamaño = 3;
    
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
            List<Fila> listaResultados){
        this.modelo = modelo;
        this.fecha = fecha;
        this.numReporte = numReporte;
        this.muestreoPrendas = muestreoPrendas;
        this.listaResultados = listaResultados;
        
        documento = new Document();
        titulo = new Paragraph("Inspección de Medidas");
        //listaResultados = new ArrayList<>();
    }
    
    public void crearPlantilla(){
        try{
            archivo = new FileOutputStream(this.getModelo() + ".pdf");
            PdfWriter.getInstance(documento,archivo);
            documento.open();
            titulo.setAlignment(1);
            
            documento.add(titulo);
            documento.add(new Paragraph("Modelo:  " + this.getModelo() + "     "
                    +"Número de Reporte: " + this.getNumReporte() + "     "
                    +"Fecha de Inspección: " + this.getFecha()));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("         " + "No. de Muestras: " + this.getMuestreoPrendas()));
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(14);
            tabla.setWidths(new float[]{8,3,3,3,3,3,3,3,3,3,3,3,3,5});
            tabla.setWidthPercentage(100);
            
            PdfPCell puntos = new PdfPCell(new Phrase("Puntos a medir"));
            puntos.setBorder(tamaño);
            puntos.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell std = new PdfPCell(new Phrase("std"));
            std.setBorder(tamaño);
            std.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell tol = new PdfPCell(new Phrase("tol"));
            tol.setBorder(tamaño);
            tol.setBackgroundColor(BaseColor.YELLOW);
            PdfPCell v1 = new PdfPCell();
            v1.setBorder(tamaño);
            v1.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v2 = new PdfPCell();
            v2.setBorder(tamaño);
            v2.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v3 = new PdfPCell();
            v3.setBorder(tamaño);
            v3.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v4 = new PdfPCell();
            v4.setBorder(tamaño);
            v4.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v5 = new PdfPCell();
            v5.setBorder(tamaño);
            v5.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v6 = new PdfPCell();
            v6.setBorder(tamaño);
            v6.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v7 = new PdfPCell();
            v7.setBorder(tamaño);
            v7.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v8 = new PdfPCell();
            v8.setBorder(tamaño);
            v8.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v9 = new PdfPCell();
            v9.setBorder(tamaño);
            v9.setBackgroundColor(BaseColor.BLUE);
            PdfPCell v10 = new PdfPCell();
            v10.setBorder(tamaño);
            v10.setBackgroundColor(BaseColor.BLUE);
            PdfPCell total = new PdfPCell(new Phrase("Total"));
            total.setBorder(tamaño);
            total.setBackgroundColor(BaseColor.YELLOW);
            
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
            
            for(Fila nfila: this.listaResultados){
                tabla.addCell(nfila.getPuntoAMedir());
                tabla.addCell(nfila.getStd());
                tabla.addCell(nfila.getTol());
                tabla.addCell(nfila.getV1()+"");
                tabla.addCell(nfila.getV2()+"");
                tabla.addCell(nfila.getV3()+"");
                tabla.addCell(nfila.getV4()+"");
                tabla.addCell(nfila.getV5()+"");
                tabla.addCell(nfila.getV6()+"");
                tabla.addCell(nfila.getV7()+"");
                tabla.addCell(nfila.getV8()+"");
                tabla.addCell(nfila.getV9()+"");
                tabla.addCell(nfila.getV10()+"");
                tabla.addCell(nfila.getTotal()+"");
            }
            
            documento.add(tabla);
            
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("                                       "
                    + "AQL"));
            documento.add(new Paragraph("                                       "
                    + "AC               RE"));
            documento.add(new Paragraph("                   "
                    + "MAYOR: ________   ________"
                    + "                                   "
                    + "ACEPTADO: _____          RECHAZO: ________"));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("FIRMA DEL PROVEEDOR: __________          FIRMA DEL INSPECTOR: __________"));
            
            documento.close();
            JOptionPane.showMessageDialog(null,"PDF creado correctamente");
            
        }catch(FileNotFoundException | DocumentException e){
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
