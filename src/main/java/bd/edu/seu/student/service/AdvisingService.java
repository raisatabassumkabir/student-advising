package bd.edu.seu.student.service;


import bd.edu.seu.student.model.Advising;
import bd.edu.seu.student.repository.AdvisingRepository;
import org.springframework.stereotype.Service;

@Service
public class AdvisingService {
    private final AdvisingRepository advisingRepository;


    public AdvisingService(AdvisingRepository advisingRepository) {
        this.advisingRepository = advisingRepository;
    }


    public Advising saveAdvising(Advising advising) {
        return advisingRepository.save(advising);
    }


}