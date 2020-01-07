package org.sid.web.ServiceController;
import org.sid.dao.ServiceRepository;
import org.sid.entities.type_services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Type_ServiceController {
    @Autowired
    ServiceRepository serviceRepository;

    @GetMapping("/service")
    public String formulaireAjoutService(Model model) {
        model.addAttribute("service", new type_services());
        return "addService";
    }

    @PostMapping("/saveService")
    public String saveService(type_services service) {
        serviceRepository.save(service);
        return "addService";
    }



   /* public @ResponseBody
    String saveService(@RequestParam("nom") String name,
                       @RequestParam("image") MultipartFile file, Services s) {
        try {
            byte[] bytes = file.getBytes();
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("D:\\Amine\\Documents\\IRISI\\S5\\Jee\\WinWin-BtoB\\uploads\\"+name + "-uploaded")));
            stream.write(bytes);
            stream.close();
            s.setImage("D:\\Amine\\Documents\\IRISI\\S5\\Jee\\WinWin-BtoB\\uploads\\"+name);
            serviceRepository.save(s);
            return "addService";
        } catch (Exception e) {
            return "addService";
        }


    }

}*/
}