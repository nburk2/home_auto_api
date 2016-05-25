import home_auto_api.Camera
import home_auto_api.User

class BootStrap {

    def init = { servletContext ->

        User me = new User(name:"nathan", username:"nate1113@comcast.net",password:"Password1").save()

        Camera one = new Camera(name:"garage", owner: me)
        println "valid: " + one.validate()
        one.save()
    }
    def destroy = {
    }
}
