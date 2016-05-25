package home_auto_api

import grails.converters.JSON

class CameraController {

    def index() {

        render Camera.list() as JSON
    }

    def create() {
        render [:] as JSON
    }

    def show(){
        render Camera.get(1) as JSON
    }

    def update() {
        def response = [updated:"somthing"]
        render response as JSON
    }
}
