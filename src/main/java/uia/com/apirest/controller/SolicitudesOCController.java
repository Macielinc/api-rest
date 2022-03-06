package uia.com.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uia.com.apirest.modelo.ItemComprasUIAModelo;
import uia.com.apirest.modelo.SolicitudOCModelo;
import uia.com.apirest.servicio.SolicitudOCServicio;

import java.io.IOException;

@Controller
public class SolicitudesOCController
{
    private SolicitudOCServicio servicioSolicitudesOC;
    //ArrayList<SolicitudOCModelo> solicitudesOC = new ArrayList<SolicitudOCModelo>();

    @Autowired
    public SolicitudesOCController(SolicitudOCServicio servicio) throws IOException {
        this.servicioSolicitudesOC = servicio;
    }



    @GetMapping("/viewSolicitudesOC")
    public String viewSolicitudesOC(ModelMap model)
    {
        model.addAttribute("solicitudesOC", servicioSolicitudesOC.getSolicitudesOC());
        return "view-solicitudesOC";
    }

    @GetMapping("/solicitudOC/{id}")
    public SolicitudOCModelo solicitudOCById(@PathVariable int id)
    {
        return  servicioSolicitudesOC.getSolicitudOC(id);
    }

    @DeleteMapping("/solicitudOC/{id}")
    public SolicitudOCModelo deleteSolicitudOCById(@PathVariable int id)
    {
        return  servicioSolicitudesOC.deleteSolicitudOC(id);
    }

    @PutMapping("/solicitudOC/{id}")
    public SolicitudOCModelo solicitudOCPutById(@PathVariable int id, @RequestBody ItemComprasUIAModelo newItem)
    {
        return  servicioSolicitudesOC.putSolicitudOC(id, newItem);
    }

    public SolicitudOCServicio getServicioSolicitudesOC() {
        return servicioSolicitudesOC;
    }

    public void setServicioSolicitudesOC(SolicitudOCServicio servicioSolicitudesOC) {
        this.servicioSolicitudesOC = servicioSolicitudesOC;
    }
}
