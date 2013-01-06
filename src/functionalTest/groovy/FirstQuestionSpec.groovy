import spock.lang.Specification

class FirstQuestionSpec extends Specification {
    void "answer first question"() {
        when:
        def curl = "curl http://localhost:8080/?q=Quelle+est+ton+adresse+email".execute()

        then:
        curl.in.text == "youribm@gmail.com"
    }
}
