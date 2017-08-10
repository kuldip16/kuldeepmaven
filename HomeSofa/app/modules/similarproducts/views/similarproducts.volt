{% if test2 is not defined %}
    <div>
        SimilarProducts Function called: {{ function }}
    </div>
{% endif %}

{% if test2 is defined %}
    <div>
        SimilarProducts 2 Function called: {{ function }}
    </div>
{% endif %}
