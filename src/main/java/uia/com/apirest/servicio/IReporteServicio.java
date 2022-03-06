package uia.com.apirest.servicio;

import uia.com.apirest.modelo.ItemComprasUIAModelo;
import uia.com.apirest.modelo.ReporteModelo;

import java.util.ArrayList;

public interface IReporteServicio {
    ArrayList<ReporteModelo> getReportes();
    Object getReporte(int id);
    void print();

    ReporteModelo deleteReportes(int id);
    ReporteModelo putReporte(int id, ItemComprasUIAModelo newItem);
}
