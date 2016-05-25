package home_auto_api

class Camera {

    String name
    String description

    static belongsTo = [owner:User]

    static constraints = {
        name                nullable: false, blank: false
        description         nullable: true, blank: false
    }
}
