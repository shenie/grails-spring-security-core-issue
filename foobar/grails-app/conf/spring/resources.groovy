import foobar.FoobarService

beans = {
    foobarService(FoobarService) {
        magicService = ref("magicService")
    }
}
