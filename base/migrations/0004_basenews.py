# -*- coding: utf-8 -*-
# Generated by Django 1.9.4 on 2016-03-17 11:39
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ('base', '0003_delete_base'),
    ]

    operations = [
        migrations.CreateModel(
            name='BaseNews',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.TextField()),
                ('description', models.TextField()),
            ],
            options={
                'abstract': False,
            },
        ),
    ]
