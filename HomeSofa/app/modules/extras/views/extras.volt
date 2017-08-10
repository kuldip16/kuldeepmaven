{% if test2 is not defined %}
    <div>
        Extras 
        <br />
        Function called: {{ function }}
    </div>
{% endif %}

{% if test2 is defined %}
    <div>
        Extras 2
        <br />
        Function called: {{ function }}
    </div>
{% endif %}
