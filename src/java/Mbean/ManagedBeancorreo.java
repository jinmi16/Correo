package Mbean;

import Util.mail.enviarMail;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import model.bean.BeanContacto;

@ManagedBean(name = "correo")
@SessionScoped
public class ManagedBeancorreo implements Serializable {

    private BeanContacto contacto = new BeanContacto();
    private enviarMail sendmsg  = new enviarMail();

    public ManagedBeancorreo() {
    }

    public BeanContacto getContacto() {
        return contacto;
    }

    public void setContacto(BeanContacto contacto) {
        this.contacto = contacto;
    }

    public void enviar() {
        int x=0;      
        x = sendmsg.Enviar(contacto);
        //if (x == 1) {
        //FacesMessage msg = new FacesMessage("Correcto", "Correo enviado");
        //FacesContext.getCurrentInstance().addMessage(null, msg);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+x);
        //} else {
        //  FacesMessage msg = new FacesMessage("Error", "Correo no ha sido enviado");
        //  FacesContext.getCurrentInstance().addMessage(null, msg);
        //}
/*
        contacto.setApellido("");
        contacto.setAsunto("");
        contacto.setCelular(null);
        contacto.setCorreo("");
        contacto.setMensaje("");
        contacto.setNombre("");        */
                     
    }

}
