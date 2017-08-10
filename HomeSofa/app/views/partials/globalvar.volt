<script>
    var offsetHeight = "";
    var base_uri = "{{ sharedData['baseUri'] is not empty ? sharedData['baseUri'] : '' }}";
    var overrideMe = "{{ sharedData['overrideMe'] is not empty ? sharedData['overrideMe'] : '' }}";
    var customVar = "{{ sharedData['customVar'] is not empty ? sharedData['customVar'] : '' }}";
    console.log(overrideMe);
    console.log(customVar);
</script>